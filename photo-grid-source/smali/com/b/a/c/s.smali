.class public final Lcom/b/a/c/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:Lcom/b/a/c/x;

.field private c:Lcom/b/a/c/bn;

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/b/a/c/s;->a:F

    .line 123
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/b/a/c/s;->d:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/b/a/c/h;
    .locals 5

    .prologue
    .line 186
    iget v0, p0, Lcom/b/a/c/s;->a:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 187
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/b/a/c/s;->a:F

    .line 189
    :cond_0
    new-instance v0, Lcom/b/a/c/h;

    iget v1, p0, Lcom/b/a/c/s;->a:F

    iget-object v2, p0, Lcom/b/a/c/s;->b:Lcom/b/a/c/x;

    iget-object v3, p0, Lcom/b/a/c/s;->c:Lcom/b/a/c/bn;

    iget-boolean v4, p0, Lcom/b/a/c/s;->d:Z

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/b/a/c/h;-><init>(FLcom/b/a/c/x;Lcom/b/a/c/bn;Z)V

    return-object v0
.end method

.method public final a(Z)Lcom/b/a/c/s;
    .locals 0

    .prologue
    .line 181
    iput-boolean p1, p0, Lcom/b/a/c/s;->d:Z

    .line 182
    return-object p0
.end method

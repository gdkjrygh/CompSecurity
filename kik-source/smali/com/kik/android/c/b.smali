.class public Lcom/kik/android/c/b;
.super Landroid/text/style/ImageSpan;
.source "SourceFile"

# interfaces
.implements Lcom/kik/android/c/i;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lkik/android/e/f;

.field private final c:Z

.field private final d:I

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Lkik/android/e/f;IZ)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0, p1}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 28
    iput-object p3, p0, Lcom/kik/android/c/b;->a:Ljava/lang/String;

    .line 29
    iput-object p4, p0, Lcom/kik/android/c/b;->b:Lkik/android/e/f;

    .line 30
    if-nez p6, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/kik/android/c/b;->c:Z

    .line 31
    iput p5, p0, Lcom/kik/android/c/b;->d:I

    .line 32
    iput-object p2, p0, Lcom/kik/android/c/b;->e:Ljava/lang/String;

    .line 33
    return-void

    .line 30
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 5

    .prologue
    .line 47
    iget-object v0, p0, Lcom/kik/android/c/b;->b:Lkik/android/e/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/android/c/b;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/kik/android/c/b;->b:Lkik/android/e/f;

    iget-object v1, p0, Lcom/kik/android/c/b;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/kik/android/c/b;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/kik/android/c/b;->a:Ljava/lang/String;

    invoke-static {v3}, Lcom/kik/android/c/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    invoke-interface {v0, v1, v2, v3}, Lkik/android/e/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    :cond_0
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/kik/android/c/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/kik/android/c/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 68
    iget v0, p0, Lcom/kik/android/c/b;->d:I

    return v0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 74
    iget-boolean v0, p0, Lcom/kik/android/c/b;->c:Z

    return v0
.end method

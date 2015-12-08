.class public final Lcom/roidapp/cloudlib/facebook/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I
    .annotation runtime Lcom/google/a/a/b;
        a = "count"
    .end annotation
.end field

.field private b:Ljava/lang/String;
    .annotation runtime Lcom/google/a/a/b;
        a = "cover_photo"
    .end annotation
.end field

.field private c:Ljava/lang/String;
    .annotation runtime Lcom/google/a/a/b;
        a = "id"
    .end annotation
.end field

.field private d:Ljava/lang/String;
    .annotation runtime Lcom/google/a/a/b;
        a = "name"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 19
    iget v0, p0, Lcom/roidapp/cloudlib/facebook/b;->a:I

    return v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/b;->b:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/b;->c:Ljava/lang/String;

    .line 50
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/b;->d:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/b;->d:Ljava/lang/String;

    return-object v0
.end method

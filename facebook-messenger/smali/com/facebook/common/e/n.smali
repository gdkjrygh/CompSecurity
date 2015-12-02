.class public Lcom/facebook/common/e/n;
.super Ljava/lang/Object;
.source "SoftErrorBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/Throwable;

.field private d:Z

.field private e:I

.field private f:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/16 v0, 0x3e8

    iput v0, p0, Lcom/facebook/common/e/n;->e:I

    .line 22
    return-void
.end method


# virtual methods
.method public a(I)Lcom/facebook/common/e/n;
    .locals 0

    .prologue
    .line 134
    iput p1, p0, Lcom/facebook/common/e/n;->e:I

    .line 135
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/common/e/n;
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/facebook/common/e/n;->a:Ljava/lang/String;

    .line 43
    return-object p0
.end method

.method public a(Ljava/lang/Throwable;)Lcom/facebook/common/e/n;
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/facebook/common/e/n;->c:Ljava/lang/Throwable;

    .line 85
    return-object p0
.end method

.method public a(Z)Lcom/facebook/common/e/n;
    .locals 0

    .prologue
    .line 106
    iput-boolean p1, p0, Lcom/facebook/common/e/n;->d:Z

    .line 107
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/common/e/n;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/common/e/n;
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/facebook/common/e/n;->b:Ljava/lang/String;

    .line 65
    return-object p0
.end method

.method public b(Z)Lcom/facebook/common/e/n;
    .locals 0

    .prologue
    .line 156
    iput-boolean p1, p0, Lcom/facebook/common/e/n;->f:Z

    .line 157
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/common/e/n;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/common/e/n;->c:Ljava/lang/Throwable;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 95
    iget-boolean v0, p0, Lcom/facebook/common/e/n;->d:Z

    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 120
    iget v0, p0, Lcom/facebook/common/e/n;->e:I

    return v0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 145
    iget-boolean v0, p0, Lcom/facebook/common/e/n;->f:Z

    return v0
.end method

.method public g()Lcom/facebook/common/e/m;
    .locals 1

    .prologue
    .line 166
    new-instance v0, Lcom/facebook/common/e/m;

    invoke-direct {v0, p0}, Lcom/facebook/common/e/m;-><init>(Lcom/facebook/common/e/n;)V

    return-object v0
.end method

.class public Lcom/facebook/auth/viewercontext/c;
.super Ljava/lang/Object;
.source "ViewerContextBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Z

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/facebook/auth/viewercontext/c;
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/auth/viewercontext/c;->a:Ljava/lang/String;

    .line 59
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/auth/viewercontext/c;
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/facebook/auth/viewercontext/c;->b:Ljava/lang/String;

    .line 79
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/auth/viewercontext/c;
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lcom/facebook/auth/viewercontext/c;->c:Ljava/lang/String;

    .line 99
    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)Lcom/facebook/auth/viewercontext/c;
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Lcom/facebook/auth/viewercontext/c;->e:Ljava/lang/String;

    .line 137
    return-object p0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 108
    iget-boolean v0, p0, Lcom/facebook/auth/viewercontext/c;->d:Z

    return v0
.end method

.method public e(Ljava/lang/String;)Lcom/facebook/auth/viewercontext/c;
    .locals 0

    .prologue
    .line 154
    iput-object p1, p0, Lcom/facebook/auth/viewercontext/c;->f:Ljava/lang/String;

    .line 155
    return-object p0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/c;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f(Ljava/lang/String;)Lcom/facebook/auth/viewercontext/c;
    .locals 0

    .prologue
    .line 163
    iput-object p1, p0, Lcom/facebook/auth/viewercontext/c;->g:Ljava/lang/String;

    .line 164
    return-object p0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/c;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/c;->g:Ljava/lang/String;

    return-object v0
.end method

.method public h()Lcom/facebook/auth/viewercontext/ViewerContext;
    .locals 1

    .prologue
    .line 173
    new-instance v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-direct {v0, p0}, Lcom/facebook/auth/viewercontext/ViewerContext;-><init>(Lcom/facebook/auth/viewercontext/c;)V

    return-object v0
.end method

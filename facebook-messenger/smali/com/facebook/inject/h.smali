.class public Lcom/facebook/inject/h;
.super Ljava/lang/Object;
.source "Binding.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/a",
            "<TT;>;"
        }
    .end annotation
.end field

.field private b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<+TT;>;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/facebook/inject/f;

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    sget-object v0, Lcom/facebook/inject/f;->NONE:Lcom/facebook/inject/f;

    iput-object v0, p0, Lcom/facebook/inject/h;->d:Lcom/facebook/inject/f;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/inject/h;->a:Lcom/google/inject/a;

    return-object v0
.end method

.method public a(Lcom/facebook/inject/f;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/facebook/inject/h;->d:Lcom/facebook/inject/f;

    .line 53
    return-void
.end method

.method public a(Lcom/google/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/a",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 28
    iput-object p1, p0, Lcom/facebook/inject/h;->a:Lcom/google/inject/a;

    .line 29
    return-void
.end method

.method public a(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 44
    iput-object p1, p0, Lcom/facebook/inject/h;->c:Ljava/lang/Class;

    .line 45
    return-void
.end method

.method public a(Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<+TT;>;)V"
        }
    .end annotation

    .prologue
    .line 36
    iput-object p1, p0, Lcom/facebook/inject/h;->b:Ljavax/inject/a;

    .line 37
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 60
    iput-boolean p1, p0, Lcom/facebook/inject/h;->e:Z

    .line 61
    return-void
.end method

.method public b()Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljavax/inject/a",
            "<+TT;>;"
        }
    .end annotation

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/inject/h;->b:Ljavax/inject/a;

    return-object v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/inject/h;->c:Ljava/lang/Class;

    return-object v0
.end method

.method public d()Lcom/facebook/inject/f;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/inject/h;->d:Lcom/facebook/inject/f;

    return-object v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 56
    iget-boolean v0, p0, Lcom/facebook/inject/h;->e:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 65
    invoke-static {p0}, Lcom/google/common/base/Objects;->toStringHelper(Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "key"

    iget-object v2, p0, Lcom/facebook/inject/h;->a:Lcom/google/inject/a;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "provider"

    iget-object v2, p0, Lcom/facebook/inject/h;->b:Ljavax/inject/a;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "scope"

    iget-object v2, p0, Lcom/facebook/inject/h;->c:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "eager"

    iget-object v2, p0, Lcom/facebook/inject/h;->d:Lcom/facebook/inject/f;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "default"

    iget-boolean v2, p0, Lcom/facebook/inject/h;->e:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Objects$ToStringHelper;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

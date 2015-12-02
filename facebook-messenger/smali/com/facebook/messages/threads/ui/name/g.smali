.class public Lcom/facebook/messages/threads/ui/name/g;
.super Ljava/lang/Object;
.source "ThreadNameViewData.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Z

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLjava/lang/String;Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-boolean p1, p0, Lcom/facebook/messages/threads/ui/name/g;->a:Z

    .line 21
    iput-object p2, p0, Lcom/facebook/messages/threads/ui/name/g;->b:Ljava/lang/String;

    .line 22
    iput-object p3, p0, Lcom/facebook/messages/threads/ui/name/g;->c:Lcom/google/common/a/es;

    .line 23
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 26
    iget-boolean v0, p0, Lcom/facebook/messages/threads/ui/name/g;->a:Z

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/messages/threads/ui/name/g;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/messages/threads/ui/name/g;->c:Lcom/google/common/a/es;

    return-object v0
.end method

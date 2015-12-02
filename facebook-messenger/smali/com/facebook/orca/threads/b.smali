.class public Lcom/facebook/orca/threads/b;
.super Ljava/lang/Object;
.source "CurrentFolderNameProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Lcom/facebook/orca/threads/FolderName;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderType;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/auth/viewercontext/e;


# direct methods
.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/auth/viewercontext/e;)V
    .locals 0
    .param p1    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/orca/annotations/CurrentFolder;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderType;",
            ">;",
            "Lcom/facebook/auth/viewercontext/e;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/orca/threads/b;->a:Ljavax/inject/a;

    .line 25
    iput-object p2, p0, Lcom/facebook/orca/threads/b;->b:Lcom/facebook/auth/viewercontext/e;

    .line 26
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/FolderName;
    .locals 2

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/orca/threads/b;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderType;

    iget-object v1, p0, Lcom/facebook/orca/threads/b;->b:Lcom/facebook/auth/viewercontext/e;

    invoke-interface {v1}, Lcom/facebook/auth/viewercontext/e;->c()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/threads/FolderName;->a(Lcom/facebook/orca/threads/FolderType;Lcom/facebook/auth/viewercontext/ViewerContext;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 15
    invoke-virtual {p0}, Lcom/facebook/orca/threads/b;->a()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    return-object v0
.end method

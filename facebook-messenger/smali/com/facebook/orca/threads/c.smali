.class public Lcom/facebook/orca/threads/c;
.super Ljava/lang/Object;
.source "CurrentFolderTypeProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Lcom/facebook/orca/threads/FolderType;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/orca/threads/g;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/threads/g;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/facebook/orca/threads/c;->a:Lcom/facebook/orca/threads/g;

    .line 20
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/FolderType;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/orca/threads/c;->a:Lcom/facebook/orca/threads/g;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/g;->b()Lcom/facebook/orca/threads/FolderType;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 12
    invoke-virtual {p0}, Lcom/facebook/orca/threads/c;->a()Lcom/facebook/orca/threads/FolderType;

    move-result-object v0

    return-object v0
.end method

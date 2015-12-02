.class final Lcom/b/a/f;
.super Ljava/lang/Object;
.source "StrictModeHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic val$savedPolicy:Lcom/b/a/a/a/g;


# direct methods
.method constructor <init>(Lcom/b/a/a/a/g;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/b/a/f;->val$savedPolicy:Lcom/b/a/a/a/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/b/a/f;->val$savedPolicy:Lcom/b/a/a/a/g;

    invoke-virtual {v0}, Lcom/b/a/a/a/g;->set()V

    .line 72
    return-void
.end method

.class Lcom/facebook/orca/contacts/picker/bh;
.super Ljava/lang/Object;
.source "InviteAllViewController.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bg;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/picker/bg;)V
    .locals 0

    .prologue
    .line 134
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bh;->a:Lcom/facebook/orca/contacts/picker/bg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bh;->a:Lcom/facebook/orca/contacts/picker/bg;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/bg;->c()V

    .line 138
    return-void
.end method

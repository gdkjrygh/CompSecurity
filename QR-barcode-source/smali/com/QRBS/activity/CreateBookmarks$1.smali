.class Lcom/QRBS/activity/CreateBookmarks$1;
.super Ljava/lang/Object;
.source "CreateBookmarks.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/CreateBookmarks;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/CreateBookmarks;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/CreateBookmarks;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/CreateBookmarks$1;->this$0:Lcom/QRBS/activity/CreateBookmarks;

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 45
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/QRBS/activity/CreateBookmarks$1;->this$0:Lcom/QRBS/activity/CreateBookmarks;

    const-class v2, Lcom/QRBS/activity/BookmarksListActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 46
    .local v0, "i":Landroid/content/Intent;
    iget-object v1, p0, Lcom/QRBS/activity/CreateBookmarks$1;->this$0:Lcom/QRBS/activity/CreateBookmarks;

    invoke-virtual {v1, v0}, Lcom/QRBS/activity/CreateBookmarks;->startActivity(Landroid/content/Intent;)V

    .line 47
    return-void
.end method

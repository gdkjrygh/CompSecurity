.class Lcom/hmobile/biblekjv/MainBookActivity$10;
.super Ljava/lang/Object;
.source "MainBookActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/MainBookActivity;->menuDialogDisplayPopup(Ljava/lang/String;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/MainBookActivity;

.field private final synthetic val$id:J


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity;J)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$10;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iput-wide p2, p0, Lcom/hmobile/biblekjv/MainBookActivity$10;->val$id:J

    .line 673
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 675
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$10;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    .line 676
    const-class v2, Lcom/hmobile/biblekjv/EditNotesActivity;

    .line 675
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 677
    .local v0, "i":Landroid/content/Intent;
    const-string v1, "notes_id"

    iget-wide v2, p0, Lcom/hmobile/biblekjv/MainBookActivity$10;->val$id:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 678
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$10;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-virtual {v1, v0}, Lcom/hmobile/biblekjv/MainBookActivity;->startActivity(Landroid/content/Intent;)V

    .line 679
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$10;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v1, v1, Lcom/hmobile/biblekjv/MainBookActivity;->qa:Lcom/hmobile/quickaction/QuickActionNotes;

    invoke-virtual {v1}, Lcom/hmobile/quickaction/QuickActionNotes;->dismiss()V

    .line 680
    return-void
.end method

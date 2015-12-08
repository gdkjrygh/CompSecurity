.class Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$1;
.super Ljava/lang/Object;
.source "BookMarkesActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;

.field private final synthetic val$bookmark:Lcom/hmobile/model/BookMarkInfo;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;Lcom/hmobile/model/BookMarkInfo;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$1;->this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;

    iput-object p2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$1;->val$bookmark:Lcom/hmobile/model/BookMarkInfo;

    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 192
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$1;->this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;

    # getter for: Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->access$0(Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;)Lcom/hmobile/biblekjv/BookMarkesActivity;

    move-result-object v1

    .line 193
    const-class v2, Lcom/hmobile/biblekjv/MainBookActivity;

    .line 192
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 194
    .local v0, "i":Landroid/content/Intent;
    const-string v1, "isFromBookMark"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 195
    const-string v1, "BookMarkId"

    iget-object v2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$1;->val$bookmark:Lcom/hmobile/model/BookMarkInfo;

    invoke-virtual {v2}, Lcom/hmobile/model/BookMarkInfo;->getID()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 196
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$1;->this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;

    # getter for: Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->access$0(Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;)Lcom/hmobile/biblekjv/BookMarkesActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/hmobile/biblekjv/BookMarkesActivity;->startActivity(Landroid/content/Intent;)V

    .line 197
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$1;->this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;

    # getter for: Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->access$0(Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;)Lcom/hmobile/biblekjv/BookMarkesActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/BookMarkesActivity;->finish()V

    .line 199
    return-void
.end method

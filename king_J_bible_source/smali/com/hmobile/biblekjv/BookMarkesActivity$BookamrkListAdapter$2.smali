.class Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$2;
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
    iput-object p1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$2;->this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;

    iput-object p2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$2;->val$bookmark:Lcom/hmobile/model/BookMarkInfo;

    .line 201
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 206
    :try_start_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$2;->val$bookmark:Lcom/hmobile/model/BookMarkInfo;

    invoke-virtual {v1}, Lcom/hmobile/model/BookMarkInfo;->delete()Z

    .line 207
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$2;->this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;

    # getter for: Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->access$0(Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;)Lcom/hmobile/biblekjv/BookMarkesActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/BookMarkesActivity;->LoadViewForBookMark()V
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    :goto_0
    return-void

    .line 209
    :catch_0
    move-exception v0

    .line 210
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0
.end method

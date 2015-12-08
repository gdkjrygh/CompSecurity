.class Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$2;
.super Ljava/lang/Object;
.source "BookMarkesActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

.field private final synthetic val$noteInfo:Lcom/hmobile/model/NotesInfo;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;Lcom/hmobile/model/NotesInfo;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$2;->this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    iput-object p2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$2;->val$noteInfo:Lcom/hmobile/model/NotesInfo;

    .line 297
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 301
    :try_start_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$2;->val$noteInfo:Lcom/hmobile/model/NotesInfo;

    invoke-virtual {v1}, Lcom/hmobile/model/NotesInfo;->delete()Z

    .line 302
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$2;->this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    # getter for: Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->access$0(Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;)Lcom/hmobile/biblekjv/BookMarkesActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/BookMarkesActivity;->LoadViewForNotes()V
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 306
    :goto_0
    return-void

    .line 303
    :catch_0
    move-exception v0

    .line 304
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0
.end method

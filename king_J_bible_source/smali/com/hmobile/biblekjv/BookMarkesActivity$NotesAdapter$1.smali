.class Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$1;
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
    iput-object p1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$1;->this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    iput-object p2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$1;->val$noteInfo:Lcom/hmobile/model/NotesInfo;

    .line 282
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 286
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$1;->this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    # getter for: Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->access$0(Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;)Lcom/hmobile/biblekjv/BookMarkesActivity;

    move-result-object v1

    .line 287
    const-class v2, Lcom/hmobile/biblekjv/MainBookActivity;

    .line 286
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 288
    .local v0, "i":Landroid/content/Intent;
    const-string v1, "isFromNotes"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 289
    const-string v1, "note_label"

    iget-object v2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$1;->val$noteInfo:Lcom/hmobile/model/NotesInfo;

    iget-object v2, v2, Lcom/hmobile/model/NotesInfo;->Lable:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 290
    const-string v1, "book_id"

    iget-object v2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$1;->val$noteInfo:Lcom/hmobile/model/NotesInfo;

    iget v2, v2, Lcom/hmobile/model/NotesInfo;->book_id:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 291
    const-string v1, "chap_id"

    iget-object v2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$1;->val$noteInfo:Lcom/hmobile/model/NotesInfo;

    iget v2, v2, Lcom/hmobile/model/NotesInfo;->chap_number:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 292
    const-string v1, "verse_id"

    iget-object v2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$1;->val$noteInfo:Lcom/hmobile/model/NotesInfo;

    iget v2, v2, Lcom/hmobile/model/NotesInfo;->verse_id:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 293
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$1;->this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    # getter for: Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->access$0(Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;)Lcom/hmobile/biblekjv/BookMarkesActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/hmobile/biblekjv/BookMarkesActivity;->startActivity(Landroid/content/Intent;)V

    .line 294
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$1;->this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    # getter for: Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->access$0(Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;)Lcom/hmobile/biblekjv/BookMarkesActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/BookMarkesActivity;->finish()V

    .line 295
    return-void
.end method

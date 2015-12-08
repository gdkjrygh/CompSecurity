.class Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$3;
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
    iput-object p1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$3;->this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    iput-object p2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$3;->val$noteInfo:Lcom/hmobile/model/NotesInfo;

    .line 308
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 311
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$3;->this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    # getter for: Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->access$0(Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;)Lcom/hmobile/biblekjv/BookMarkesActivity;

    move-result-object v1

    .line 312
    const-class v2, Lcom/hmobile/biblekjv/EditNotesActivity;

    .line 311
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 313
    .local v0, "i":Landroid/content/Intent;
    const-string v1, "notes_id"

    iget-object v2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$3;->val$noteInfo:Lcom/hmobile/model/NotesInfo;

    invoke-virtual {v2}, Lcom/hmobile/model/NotesInfo;->getID()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 314
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$3;->this$1:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    # getter for: Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->access$0(Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;)Lcom/hmobile/biblekjv/BookMarkesActivity;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lcom/hmobile/biblekjv/BookMarkesActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 315
    return-void
.end method

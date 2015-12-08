.class final Lcom/kik/cards/usermedia/f;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/usermedia/CustomGalleryActivity;


# direct methods
.method constructor <init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;)V
    .locals 0

    .prologue
    .line 212
    iput-object p1, p0, Lcom/kik/cards/usermedia/f;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 212
    check-cast p2, Lcom/kik/cards/usermedia/q;

    iget-object v0, p0, Lcom/kik/cards/usermedia/f;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->c(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Landroid/widget/GridView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;

    invoke-virtual {v0, p2}, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->a(Lcom/kik/cards/usermedia/q;)V

    invoke-virtual {v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity$b;->notifyDataSetChanged()V

    iget-object v0, p0, Lcom/kik/cards/usermedia/f;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->c(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Landroid/widget/GridView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/GridView;->requestLayout()V

    return-void
.end method

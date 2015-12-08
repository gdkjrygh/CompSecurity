.class final Lcom/kik/cards/usermedia/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/kik/cards/usermedia/CustomGalleryActivity;


# direct methods
.method constructor <init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;)V
    .locals 0

    .prologue
    .line 200
    iput-object p1, p0, Lcom/kik/cards/usermedia/e;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lcom/kik/cards/usermedia/e;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-virtual {v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->finish()V

    .line 206
    return-void
.end method

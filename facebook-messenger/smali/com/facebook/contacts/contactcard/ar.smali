.class Lcom/facebook/contacts/contactcard/ar;
.super Ljava/lang/Object;
.source "MapSectionView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/MapSectionView;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/MapSectionView;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ar;->a:Lcom/facebook/contacts/contactcard/MapSectionView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ar;->a:Lcom/facebook/contacts/contactcard/MapSectionView;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/MapSectionView;->a(Lcom/facebook/contacts/contactcard/MapSectionView;)Lcom/facebook/contacts/contactcard/x;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ar;->a:Lcom/facebook/contacts/contactcard/MapSectionView;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/MapSectionView;->a(Lcom/facebook/contacts/contactcard/MapSectionView;)Lcom/facebook/contacts/contactcard/x;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/contacts/contactcard/x;->a()V

    .line 84
    :cond_0
    return-void
.end method

.class Lcom/facebook/contacts/contactcard/ad;
.super Ljava/lang/Object;
.source "EntrySectionView.java"

# interfaces
.implements Lcom/facebook/contacts/contactcard/entry/k;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/EntrySectionView;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/EntrySectionView;)V
    .locals 0

    .prologue
    .line 163
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ad;->a:Lcom/facebook/contacts/contactcard/EntrySectionView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/models/entry/Entry;)V
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ad;->a:Lcom/facebook/contacts/contactcard/EntrySectionView;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->a(Lcom/facebook/contacts/contactcard/EntrySectionView;)Lcom/facebook/contacts/contactcard/af;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ad;->a:Lcom/facebook/contacts/contactcard/EntrySectionView;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->a(Lcom/facebook/contacts/contactcard/EntrySectionView;)Lcom/facebook/contacts/contactcard/af;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/contacts/contactcard/af;->a(Lcom/facebook/contacts/models/entry/Entry;)V

    .line 169
    :cond_0
    return-void
.end method

.method public b(Lcom/facebook/contacts/models/entry/Entry;)V
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ad;->a:Lcom/facebook/contacts/contactcard/EntrySectionView;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->a(Lcom/facebook/contacts/contactcard/EntrySectionView;)Lcom/facebook/contacts/contactcard/af;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ad;->a:Lcom/facebook/contacts/contactcard/EntrySectionView;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->a(Lcom/facebook/contacts/contactcard/EntrySectionView;)Lcom/facebook/contacts/contactcard/af;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/contacts/contactcard/af;->b(Lcom/facebook/contacts/models/entry/Entry;)V

    .line 176
    :cond_0
    return-void
.end method

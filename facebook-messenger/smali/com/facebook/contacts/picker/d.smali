.class Lcom/facebook/contacts/picker/d;
.super Landroid/widget/Filter;
.source "BaseSearchableContactPickerListAdapter.java"


# instance fields
.field final synthetic a:Lcom/facebook/contacts/picker/c;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/picker/c;)V
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/facebook/contacts/picker/d;->a:Lcom/facebook/contacts/picker/c;

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method


# virtual methods
.method protected performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 1

    .prologue
    .line 32
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method protected publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 0

    .prologue
    .line 37
    return-void
.end method

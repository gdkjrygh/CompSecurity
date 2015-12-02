.class public abstract Lcom/facebook/contacts/picker/c;
.super Lcom/facebook/contacts/picker/b;
.source "BaseSearchableContactPickerListAdapter.java"

# interfaces
.implements Landroid/widget/Filterable;
.implements Lcom/facebook/contacts/picker/w;
.implements Lcom/facebook/widget/a/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Lcom/facebook/contacts/picker/b;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/facebook/contacts/picker/u;
.end method

.method public abstract b()V
.end method

.method public synthetic c()Lcom/facebook/widget/a/f;
    .locals 1

    .prologue
    .line 13
    invoke-virtual {p0}, Lcom/facebook/contacts/picker/c;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    return-object v0
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    .prologue
    .line 28
    new-instance v0, Lcom/facebook/contacts/picker/d;

    invoke-direct {v0, p0}, Lcom/facebook/contacts/picker/d;-><init>(Lcom/facebook/contacts/picker/c;)V

    return-object v0
.end method

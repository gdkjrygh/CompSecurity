.class Lcom/facebook/contacts/picker/al;
.super Ljava/lang/Object;
.source "ContactPickerView.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/picker/ak;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/picker/ak;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/facebook/contacts/picker/al;->a:Lcom/facebook/contacts/picker/ak;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .prologue
    .line 95
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/contacts/picker/al;->a:Lcom/facebook/contacts/picker/ak;

    invoke-static {v0, p2}, Lcom/facebook/contacts/picker/ak;->a(Lcom/facebook/contacts/picker/ak;I)V

    .line 88
    return-void
.end method

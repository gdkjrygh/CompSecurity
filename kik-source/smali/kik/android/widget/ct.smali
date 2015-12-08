.class final Lkik/android/widget/ct;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/PagerIconTabs;


# direct methods
.method constructor <init>(Lkik/android/widget/PagerIconTabs;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lkik/android/widget/ct;->a:Lkik/android/widget/PagerIconTabs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 49
    iget-object v1, p0, Lkik/android/widget/ct;->a:Lkik/android/widget/PagerIconTabs;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v1, v0}, Lkik/android/widget/PagerIconTabs;->a(Lkik/android/widget/PagerIconTabs;I)V

    .line 50
    return-void
.end method

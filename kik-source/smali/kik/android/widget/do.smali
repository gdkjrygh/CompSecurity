.class final Lkik/android/widget/do;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/dl;


# direct methods
.method constructor <init>(Lkik/android/widget/dl;)V
    .locals 0

    .prologue
    .line 99
    iput-object p1, p0, Lkik/android/widget/do;->a:Lkik/android/widget/dl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lkik/android/widget/do;->a:Lkik/android/widget/dl;

    invoke-static {v0, p2}, Lkik/android/widget/dl;->a(Lkik/android/widget/dl;Landroid/view/View;)V

    .line 104
    const/4 v0, 0x1

    return v0
.end method

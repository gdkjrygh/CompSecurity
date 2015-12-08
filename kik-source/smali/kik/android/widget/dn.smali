.class final Lkik/android/widget/dn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/dl;


# direct methods
.method constructor <init>(Lkik/android/widget/dl;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lkik/android/widget/dn;->a:Lkik/android/widget/dl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .prologue
    .line 96
    iget-object v0, p0, Lkik/android/widget/dn;->a:Lkik/android/widget/dl;

    const/4 v1, 0x0

    invoke-static {v0, p2, v1}, Lkik/android/widget/dl;->a(Lkik/android/widget/dl;Landroid/view/View;Z)V

    .line 97
    return-void
.end method

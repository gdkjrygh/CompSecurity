.class final Lkik/android/widget/preferences/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroid/preference/Preference;


# direct methods
.method constructor <init>(Landroid/view/View;Landroid/view/View;Landroid/preference/Preference;)V
    .locals 0

    .prologue
    .line 175
    iput-object p1, p0, Lkik/android/widget/preferences/y;->a:Landroid/view/View;

    iput-object p2, p0, Lkik/android/widget/preferences/y;->b:Landroid/view/View;

    iput-object p3, p0, Lkik/android/widget/preferences/y;->c:Landroid/preference/Preference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 179
    iget-object v0, p0, Lkik/android/widget/preferences/y;->a:Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/preferences/y;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c004c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    new-instance v2, Lkik/android/widget/preferences/z;

    invoke-direct {v2, p0}, Lkik/android/widget/preferences/z;-><init>(Lkik/android/widget/preferences/y;)V

    invoke-static {v0, v1, v2}, Lkik/android/util/av;->b(Landroid/view/View;ILandroid/view/animation/Animation$AnimationListener;)V

    .line 200
    return-void
.end method

.class public final Lkik/android/widget/cp;
.super Lkik/android/chat/fragment/KikDialogFragment$a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lkik/a/d/k;Ljava/util/Vector;Landroid/content/Context;Ljava/lang/String;Lcom/kik/android/a;Lkik/a/e/i;)V
    .locals 9

    .prologue
    .line 27
    invoke-direct {p0}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>()V

    .line 29
    const v0, 0x7f03003e

    const/4 v1, 0x0

    invoke-static {p3, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    .line 30
    const v0, 0x7f0e00f0

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/CheckBox;

    .line 31
    new-instance v0, Lkik/android/widget/cq;

    move-object v1, p0

    move-object v2, p5

    move-object v3, p4

    move-object v5, p6

    move-object v6, p2

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lkik/android/widget/cq;-><init>(Lkik/android/widget/cp;Lcom/kik/android/a;Ljava/lang/String;Landroid/widget/CheckBox;Lkik/a/e/i;Ljava/util/Vector;Lkik/a/d/k;)V

    .line 49
    const v1, 0x7f0901fe

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lkik/android/widget/cp;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {p1}, Lkik/android/util/cq;->b(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const v3, 0x7f0901ff

    invoke-static {v3, v2}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f090299

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f0902fd

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    invoke-virtual {v0, v8}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Landroid/view/View;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 54
    return-void
.end method

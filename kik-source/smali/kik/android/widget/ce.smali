.class public final Lkik/android/widget/ce;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lkik/android/util/ar;

.field private static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    sput-boolean v0, Lkik/android/widget/ce;->b:Z

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 135
    if-eqz p0, :cond_0

    .line 136
    sget-object v0, Lkik/android/widget/ce;->a:Lkik/android/util/ar;

    invoke-interface {v0}, Lkik/android/util/ar;->c()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 137
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "kik.version.number.eula"

    const/16 v2, 0x2d

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 139
    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;Lkik/android/chat/fragment/KikScopedDialogFragment;)V
    .locals 9

    .prologue
    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v3, 0x1

    .line 38
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 114
    :cond_0
    :goto_0
    return-void

    .line 41
    :cond_1
    sget-object v0, Lkik/android/widget/ce;->a:Lkik/android/util/ar;

    invoke-interface {v0}, Lkik/android/util/ar;->c()Landroid/content/SharedPreferences;

    move-result-object v6

    .line 43
    invoke-static {p0}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v7

    new-instance v0, Lkik/android/d/a;

    const-string v2, "eula-resign-app"

    sget-object v5, Lkik/android/widget/ce;->a:Lkik/android/util/ar;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lkik/android/d/a;-><init>(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/Runnable;Lkik/android/util/ar;)V

    invoke-interface {v7, v0}, Lkik/android/d/c;->a(Lkik/android/d/b;)Z

    .line 46
    const-string v0, "kik.version.number.eula"

    invoke-interface {v6, v0, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 49
    sget-boolean v1, Lkik/android/widget/ce;->b:Z

    if-nez v1, :cond_0

    const/16 v1, 0x2d

    if-ge v0, v1, :cond_0

    .line 50
    const v0, 0x7f030040

    invoke-static {p0, v0, v4}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 51
    const v0, 0x7f0e00f1

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 53
    new-instance v2, Lkik/android/util/bg;

    invoke-direct {v2, p0}, Lkik/android/util/bg;-><init>(Landroid/content/Context;)V

    .line 54
    invoke-virtual {v2}, Lkik/android/util/bg;->a()Ljava/lang/String;

    move-result-object v2

    .line 56
    const v4, 0x7f09005c

    new-array v5, v3, [Ljava/lang/Object;

    aput-object v2, v5, v8

    invoke-virtual {p0, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-direct {v0, v4}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    .line 60
    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Landroid/view/View;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    invoke-virtual {v1, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v4, 0x7f0902c3

    new-instance v5, Lkik/android/widget/cg;

    invoke-direct {v5, p0}, Lkik/android/widget/cg;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v4, v5}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v4, 0x7f090302

    new-instance v5, Lkik/android/widget/cf;

    invoke-direct {v5, p0, v2}, Lkik/android/widget/cf;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v1, v4, v5}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 82
    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v0

    .line 84
    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment;->a()V

    .line 86
    sput-boolean v3, Lkik/android/widget/ce;->b:Z

    .line 87
    invoke-virtual {p1, v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 89
    new-instance v1, Lkik/android/widget/ch;

    invoke-direct {v1, p0, p1}, Lkik/android/widget/ch;-><init>(Landroid/content/Context;Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment;->a(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 106
    new-instance v1, Lkik/android/widget/ci;

    invoke-direct {v1, p0, p1}, Lkik/android/widget/ci;-><init>(Landroid/content/Context;Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment$c;)V

    goto/16 :goto_0
.end method

.method public static a(Lkik/android/util/ar;)V
    .locals 0

    .prologue
    .line 162
    sput-object p0, Lkik/android/widget/ce;->a:Lkik/android/util/ar;

    .line 163
    return-void
.end method

.method static synthetic a()Z
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    sput-boolean v0, Lkik/android/widget/ce;->b:Z

    return v0
.end method

.method static synthetic b(Landroid/content/Context;Lkik/android/chat/fragment/KikScopedDialogFragment;)V
    .locals 4

    .prologue
    .line 22
    const/4 v0, 0x0

    sput-boolean v0, Lkik/android/widget/ce;->b:Z

    invoke-virtual {p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lkik/android/widget/cj;

    invoke-direct {v1, p0, p1}, Lkik/android/widget/cj;-><init>(Landroid/content/Context;Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method static synthetic c(Landroid/content/Context;Lkik/android/chat/fragment/KikScopedDialogFragment;)V
    .locals 4

    .prologue
    .line 22
    const v0, 0x7f03003f

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Landroid/view/View;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v2, 0x7f090193

    new-instance v3, Lkik/android/widget/ck;

    invoke-direct {v3, p0, p1}, Lkik/android/widget/ck;-><init>(Landroid/content/Context;Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    invoke-virtual {v0, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    return-void
.end method

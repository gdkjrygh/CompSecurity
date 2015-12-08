.class final Lkik/android/widget/preferences/ap;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/MatchingPreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/MatchingPreference;)V
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lkik/android/widget/preferences/ap;->a:Lkik/android/widget/preferences/MatchingPreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 46
    iget-object v0, p0, Lkik/android/widget/preferences/ap;->a:Lkik/android/widget/preferences/MatchingPreference;

    iget-object v0, v0, Lkik/android/widget/preferences/MatchingPreference;->b:Lkik/a/e/b;

    invoke-interface {v0}, Lkik/a/e/b;->d()V

    .line 47
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 49
    iget-object v0, p0, Lkik/android/widget/preferences/ap;->a:Lkik/android/widget/preferences/MatchingPreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/MatchingPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090027

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 50
    return-void
.end method

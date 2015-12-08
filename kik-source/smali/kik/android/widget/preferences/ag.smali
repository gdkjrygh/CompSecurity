.class final Lkik/android/widget/preferences/ag;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/KikProfilePicPreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/KikProfilePicPreference;)V
    .locals 0

    .prologue
    .line 147
    iput-object p1, p0, Lkik/android/widget/preferences/ag;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lkik/android/widget/preferences/ag;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-static {v0}, Lkik/android/widget/preferences/KikProfilePicPreference;->d(Lkik/android/widget/preferences/KikProfilePicPreference;)Lkik/android/widget/preferences/KikProfilePicPreference$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lkik/android/widget/preferences/ag;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-static {v0}, Lkik/android/widget/preferences/KikProfilePicPreference;->d(Lkik/android/widget/preferences/KikProfilePicPreference;)Lkik/android/widget/preferences/KikProfilePicPreference$a;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/widget/preferences/KikProfilePicPreference$a;->a()V

    .line 155
    :cond_0
    return-void
.end method

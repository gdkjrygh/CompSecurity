.class final Lkik/android/widget/preferences/ax;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/NotifyNewPeoplePreference;Z)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lkik/android/widget/preferences/ax;->b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;

    iput-boolean p2, p0, Lkik/android/widget/preferences/ax;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 118
    iget-object v1, p0, Lkik/android/widget/preferences/ax;->b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;

    iget-boolean v0, p0, Lkik/android/widget/preferences/ax;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v1, v0}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->a(Lkik/android/widget/preferences/NotifyNewPeoplePreference;Z)V

    .line 119
    iget-object v0, p0, Lkik/android/widget/preferences/ax;->b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->c()V

    .line 120
    return-void

    .line 118
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

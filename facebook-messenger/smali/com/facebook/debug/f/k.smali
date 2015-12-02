.class public Lcom/facebook/debug/f/k;
.super Lcom/facebook/widget/c/c;
.source "UiThreadWatchdogPreference.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/widget/c/c;-><init>(Landroid/content/Context;)V

    .line 19
    sget-object v0, Lcom/facebook/prefs/shared/aj;->s:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/debug/f/k;->setKey(Ljava/lang/String;)V

    .line 20
    sget v0, Lcom/facebook/o;->debug_ui_thread_watchdog_pref_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/debug/f/k;->setTitle(I)V

    .line 21
    sget v0, Lcom/facebook/o;->debug_ui_thread_watchdog_pref_summary:I

    invoke-virtual {p0, v0}, Lcom/facebook/debug/f/k;->setSummary(I)V

    .line 22
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/debug/f/k;->setDefaultValue(Ljava/lang/Object;)V

    .line 23
    return-void
.end method

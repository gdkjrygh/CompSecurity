.class public Lcom/facebook/debug/fps/h;
.super Lcom/facebook/widget/c/c;
.source "FPSPreference.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/widget/c/c;-><init>(Landroid/content/Context;)V

    .line 19
    sget-object v0, Lcom/facebook/prefs/shared/aj;->q:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/debug/fps/h;->setKey(Ljava/lang/String;)V

    .line 20
    sget v0, Lcom/facebook/o;->debug_fps_enabled_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/debug/fps/h;->setTitle(I)V

    .line 21
    sget v0, Lcom/facebook/o;->debug_fps_enabled_summary:I

    invoke-virtual {p0, v0}, Lcom/facebook/debug/fps/h;->setSummary(I)V

    .line 22
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/debug/fps/h;->setDefaultValue(Ljava/lang/Object;)V

    .line 23
    return-void
.end method

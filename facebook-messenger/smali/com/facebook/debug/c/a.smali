.class public Lcom/facebook/debug/c/a;
.super Lcom/facebook/widget/c/e;
.source "DebugLoggingLevelPreference.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/widget/c/e;-><init>(Landroid/content/Context;)V

    .line 18
    sget-object v0, Lcom/facebook/prefs/shared/aj;->i:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/debug/c/a;->setKey(Ljava/lang/String;)V

    .line 19
    sget v0, Lcom/facebook/o;->debug_log_level:I

    invoke-virtual {p0, v0}, Lcom/facebook/debug/c/a;->setTitle(I)V

    .line 20
    const-string v0, "-1"

    invoke-virtual {p0, v0}, Lcom/facebook/debug/c/a;->setDefaultValue(Ljava/lang/Object;)V

    .line 21
    sget v0, Lcom/facebook/c;->logger_levels:I

    invoke-virtual {p0, v0}, Lcom/facebook/debug/c/a;->setEntries(I)V

    .line 22
    sget v0, Lcom/facebook/c;->logger_levels_values:I

    invoke-virtual {p0, v0}, Lcom/facebook/debug/c/a;->setEntryValues(I)V

    .line 23
    return-void
.end method

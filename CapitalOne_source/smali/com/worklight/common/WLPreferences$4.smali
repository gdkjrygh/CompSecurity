.class Lcom/worklight/common/WLPreferences$4;
.super Ljava/lang/Object;
.source "WLPreferences.java"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/worklight/common/WLPreferences;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/worklight/common/WLPreferences;


# direct methods
.method constructor <init>(Lcom/worklight/common/WLPreferences;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/worklight/common/WLPreferences$4;->this$0:Lcom/worklight/common/WLPreferences;

    .line 312
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 3
    .param p1, "preference"    # Landroid/preference/Preference;
    .param p2, "newValue"    # Ljava/lang/Object;

    .prologue
    .line 318
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    .line 320
    .local v0, "newAppVersion":Ljava/lang/String;
    iget-object v1, p0, Lcom/worklight/common/WLPreferences$4;->this$0:Lcom/worklight/common/WLPreferences;

    invoke-virtual {v1}, Lcom/worklight/common/WLPreferences;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "newAppVersionPref"

    invoke-static {v1, v2, v0}, Lcom/worklight/common/WLUtils;->writeWLPref(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    iget-object v1, p0, Lcom/worklight/common/WLPreferences$4;->this$0:Lcom/worklight/common/WLPreferences;

    # getter for: Lcom/worklight/common/WLPreferences;->appVersionEditTextPreference:Landroid/preference/EditTextPreference;
    invoke-static {v1}, Lcom/worklight/common/WLPreferences;->access$6(Lcom/worklight/common/WLPreferences;)Landroid/preference/EditTextPreference;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/preference/EditTextPreference;->setSummary(Ljava/lang/CharSequence;)V

    .line 324
    const/4 v1, 0x1

    return v1
.end method

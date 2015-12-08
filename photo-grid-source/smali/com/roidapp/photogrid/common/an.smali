.class public final Lcom/roidapp/photogrid/common/an;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Landroid/content/SharedPreferences;


# direct methods
.method public static a(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 25
    invoke-static {p0}, Lcom/roidapp/photogrid/common/an;->b(Landroid/content/Context;)V

    .line 26
    sget-object v0, Lcom/roidapp/photogrid/common/an;->a:Landroid/content/SharedPreferences;

    const-string v1, "language"

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/Context;I)Ljava/util/Locale;
    .locals 3

    .prologue
    .line 31
    packed-switch p1, :pswitch_data_0

    .line 132
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 135
    :goto_0
    return-object v0

    .line 33
    :pswitch_0
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    goto :goto_0

    .line 36
    :pswitch_1
    sget-object v0, Ljava/util/Locale;->GERMANY:Ljava/util/Locale;

    goto :goto_0

    .line 39
    :pswitch_2
    sget-object v0, Ljava/util/Locale;->FRENCH:Ljava/util/Locale;

    goto :goto_0

    .line 42
    :pswitch_3
    sget-object v0, Ljava/util/Locale;->JAPANESE:Ljava/util/Locale;

    goto :goto_0

    .line 45
    :pswitch_4
    sget-object v0, Ljava/util/Locale;->KOREAN:Ljava/util/Locale;

    goto :goto_0

    .line 48
    :pswitch_5
    new-instance v0, Ljava/util/Locale;

    const-string v1, "th"

    const-string v2, "TH"

    invoke-direct {v0, v1, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 51
    :pswitch_6
    sget-object v0, Ljava/util/Locale;->SIMPLIFIED_CHINESE:Ljava/util/Locale;

    goto :goto_0

    .line 54
    :pswitch_7
    sget-object v0, Ljava/util/Locale;->TAIWAN:Ljava/util/Locale;

    goto :goto_0

    .line 57
    :pswitch_8
    new-instance v0, Ljava/util/Locale;

    const-string v1, "es"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 60
    :pswitch_9
    new-instance v0, Ljava/util/Locale;

    const-string v1, "ar"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 63
    :pswitch_a
    new-instance v0, Ljava/util/Locale;

    const-string v1, "tr"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 66
    :pswitch_b
    new-instance v0, Ljava/util/Locale;

    const-string v1, "ru"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 69
    :pswitch_c
    new-instance v0, Ljava/util/Locale;

    const-string v1, "hi"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 72
    :pswitch_d
    new-instance v0, Ljava/util/Locale;

    const-string v1, "in"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 75
    :pswitch_e
    new-instance v0, Ljava/util/Locale;

    const-string v1, "it"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 78
    :pswitch_f
    new-instance v0, Ljava/util/Locale;

    const-string v1, "ms"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 81
    :pswitch_10
    new-instance v0, Ljava/util/Locale;

    const-string v1, "pt"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 84
    :pswitch_11
    new-instance v0, Ljava/util/Locale;

    const-string v1, "uk"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 87
    :pswitch_12
    new-instance v0, Ljava/util/Locale;

    const-string v1, "vi"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 90
    :pswitch_13
    new-instance v0, Ljava/util/Locale;

    const-string v1, "fa"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 93
    :pswitch_14
    new-instance v0, Ljava/util/Locale;

    const-string v1, "pl"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 96
    :pswitch_15
    new-instance v0, Ljava/util/Locale;

    const-string v1, "az"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 99
    :pswitch_16
    new-instance v0, Ljava/util/Locale;

    const-string v1, "da"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 102
    :pswitch_17
    new-instance v0, Ljava/util/Locale;

    const-string v1, "no"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 105
    :pswitch_18
    new-instance v0, Ljava/util/Locale;

    const-string v1, "iw"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 108
    :pswitch_19
    new-instance v0, Ljava/util/Locale;

    const-string v1, "nl"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 111
    :pswitch_1a
    new-instance v0, Ljava/util/Locale;

    const-string v1, "ro"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 114
    :pswitch_1b
    new-instance v0, Ljava/util/Locale;

    const-string v1, "el"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 117
    :pswitch_1c
    new-instance v0, Ljava/util/Locale;

    const-string v1, "cs"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 120
    :pswitch_1d
    new-instance v0, Ljava/util/Locale;

    const-string v1, "hu"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 123
    :pswitch_1e
    new-instance v0, Ljava/util/Locale;

    const-string v1, "bg"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 126
    :pswitch_1f
    new-instance v0, Ljava/util/Locale;

    const-string v1, "sv"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 129
    :pswitch_20
    new-instance v0, Ljava/util/Locale;

    const-string v1, "sr"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
        :pswitch_20
    .end packed-switch
.end method

.method public static a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 173
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    .line 174
    const-string v1, "photogrid_current_process_id"

    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 175
    return-void
.end method

.method private static b(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 19
    sget-object v0, Lcom/roidapp/photogrid/common/an;->a:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    .line 20
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lcom/roidapp/photogrid/common/an;->a:Landroid/content/SharedPreferences;

    .line 22
    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;I)V
    .locals 3

    .prologue
    .line 151
    invoke-static {p0, p1}, Lcom/roidapp/photogrid/common/an;->a(Landroid/content/Context;I)Ljava/util/Locale;

    move-result-object v0

    .line 152
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    .line 153
    iput-object v0, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 1139
    invoke-static {p0}, Lcom/roidapp/photogrid/common/an;->b(Landroid/content/Context;)V

    .line 1140
    sget-object v0, Lcom/roidapp/photogrid/common/an;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1141
    const-string v2, "language"

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1142
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 155
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 156
    return-void
.end method

.method public static b(Landroid/os/Bundle;)Z
    .locals 2

    .prologue
    .line 179
    if-eqz p0, :cond_0

    .line 180
    const-string v0, "photogrid_current_process_id"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 181
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 182
    const/4 v0, 0x1

    .line 185
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

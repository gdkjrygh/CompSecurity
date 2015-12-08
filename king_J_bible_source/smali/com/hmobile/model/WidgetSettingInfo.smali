.class public Lcom/hmobile/model/WidgetSettingInfo;
.super Lcom/hmobile/activerecorbase/ActiveRecordBase;
.source "WidgetSettingInfo.java"


# instance fields
.field public WidgetFontSize:I

.field public WidgetFontStyle:Ljava/lang/String;

.field public isLowLight:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 11
    invoke-direct {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;-><init>()V

    .line 15
    const/16 v0, 0x12

    iput v0, p0, Lcom/hmobile/model/WidgetSettingInfo;->WidgetFontSize:I

    .line 16
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/hmobile/model/WidgetSettingInfo;->isLowLight:Z

    .line 17
    const-string v0, "Roboto-Regular.ttf"

    iput-object v0, p0, Lcom/hmobile/model/WidgetSettingInfo;->WidgetFontStyle:Ljava/lang/String;

    .line 13
    return-void
.end method

.method public static ResetDbValue()V
    .locals 3

    .prologue
    .line 45
    const/16 v0, 0x12

    const-string v1, "Roboto-Regular.ttf"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/hmobile/model/WidgetSettingInfo;->updateWidgetSetting(ILjava/lang/String;Z)V

    .line 46
    return-void
.end method

.method public static getSetting()Lcom/hmobile/model/WidgetSettingInfo;
    .locals 5

    .prologue
    .line 50
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v3

    .line 51
    const-class v4, Lcom/hmobile/model/WidgetSettingInfo;

    invoke-virtual {v3, v4}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findAll(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    .line 52
    .local v2, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/WidgetSettingInfo;>;"
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_0

    .line 53
    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/hmobile/model/WidgetSettingInfo;

    .line 63
    :goto_0
    return-object v3

    .line 55
    :cond_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v3

    .line 56
    const-class v4, Lcom/hmobile/model/WidgetSettingInfo;

    invoke-virtual {v3, v4}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->newEntity(Ljava/lang/Class;)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/WidgetSettingInfo;

    .line 57
    .local v1, "info":Lcom/hmobile/model/WidgetSettingInfo;
    invoke-virtual {v1}, Lcom/hmobile/model/WidgetSettingInfo;->save()J
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v1

    .line 58
    goto :goto_0

    .line 60
    .end local v1    # "info":Lcom/hmobile/model/WidgetSettingInfo;
    :catch_0
    move-exception v0

    .line 61
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    .line 63
    const/4 v3, 0x0

    goto :goto_0
.end method

.method public static updateWidgetSetting(ILjava/lang/String;Z)V
    .locals 5
    .param p0, "size"    # I
    .param p1, "style"    # Ljava/lang/String;
    .param p2, "islow"    # Z

    .prologue
    .line 22
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v3

    .line 23
    const-class v4, Lcom/hmobile/model/WidgetSettingInfo;

    invoke-virtual {v3, v4}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findAll(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    .line 24
    .local v2, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/WidgetSettingInfo;>;"
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_0

    .line 25
    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/WidgetSettingInfo;

    .line 26
    .local v1, "info":Lcom/hmobile/model/WidgetSettingInfo;
    iput p0, v1, Lcom/hmobile/model/WidgetSettingInfo;->WidgetFontSize:I

    .line 27
    iput-object p1, v1, Lcom/hmobile/model/WidgetSettingInfo;->WidgetFontStyle:Ljava/lang/String;

    .line 28
    iput-boolean p2, v1, Lcom/hmobile/model/WidgetSettingInfo;->isLowLight:Z

    .line 29
    invoke-virtual {v1}, Lcom/hmobile/model/WidgetSettingInfo;->save()J

    .line 42
    .end local v1    # "info":Lcom/hmobile/model/WidgetSettingInfo;
    .end local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/WidgetSettingInfo;>;"
    :goto_0
    return-void

    .line 31
    .restart local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/WidgetSettingInfo;>;"
    :cond_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v3

    .line 32
    const-class v4, Lcom/hmobile/model/WidgetSettingInfo;

    invoke-virtual {v3, v4}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->newEntity(Ljava/lang/Class;)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/WidgetSettingInfo;

    .line 33
    .restart local v1    # "info":Lcom/hmobile/model/WidgetSettingInfo;
    iput p0, v1, Lcom/hmobile/model/WidgetSettingInfo;->WidgetFontSize:I

    .line 34
    iput-object p1, v1, Lcom/hmobile/model/WidgetSettingInfo;->WidgetFontStyle:Ljava/lang/String;

    .line 35
    iput-boolean p2, v1, Lcom/hmobile/model/WidgetSettingInfo;->isLowLight:Z

    .line 36
    invoke-virtual {v1}, Lcom/hmobile/model/WidgetSettingInfo;->save()J
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 39
    .end local v1    # "info":Lcom/hmobile/model/WidgetSettingInfo;
    .end local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/WidgetSettingInfo;>;"
    :catch_0
    move-exception v0

    .line 40
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0
.end method

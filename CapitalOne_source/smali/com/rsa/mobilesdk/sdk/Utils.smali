.class public Lcom/rsa/mobilesdk/sdk/Utils;
.super Ljava/lang/Object;
.source "Utils.java"


# static fields
.field private static mDecimalFormat:Ljava/text/DecimalFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 109
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "###.########;-###"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/rsa/mobilesdk/sdk/Utils;->mDecimalFormat:Ljava/text/DecimalFormat;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getBooleanProperty(Ljava/util/Properties;Ljava/lang/String;Z)Z
    .locals 4
    .param p0, "properties"    # Ljava/util/Properties;
    .param p1, "propertyKey"    # Ljava/lang/String;
    .param p2, "defaultValue"    # Z

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 99
    if-nez p0, :cond_0

    .line 104
    .end local p2    # "defaultValue":Z
    :goto_0
    return p2

    .line 102
    .restart local p2    # "defaultValue":Z
    :cond_0
    if-eqz p2, :cond_1

    move v0, v2

    .line 103
    .local v0, "defaultInt":I
    :goto_1
    invoke-static {p0, p1, v0}, Lcom/rsa/mobilesdk/sdk/Utils;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;I)I

    move-result v1

    .line 104
    .local v1, "intresult":I
    if-eqz v1, :cond_2

    :goto_2
    move p2, v2

    goto :goto_0

    .end local v0    # "defaultInt":I
    .end local v1    # "intresult":I
    :cond_1
    move v0, v3

    .line 102
    goto :goto_1

    .restart local v0    # "defaultInt":I
    .restart local v1    # "intresult":I
    :cond_2
    move v2, v3

    .line 104
    goto :goto_2
.end method

.method public static getDoubleString(D)Ljava/lang/String;
    .locals 2
    .param p0, "d"    # D

    .prologue
    .line 15
    sget-object v0, Lcom/rsa/mobilesdk/sdk/Utils;->mDecimalFormat:Ljava/text/DecimalFormat;

    invoke-virtual {v0, p0, p1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getIntProperty(Ljava/util/Properties;Ljava/lang/String;I)I
    .locals 5
    .param p0, "properties"    # Ljava/util/Properties;
    .param p1, "propertyKey"    # Ljava/lang/String;
    .param p2, "defaulrPropertyValue"    # I

    .prologue
    .line 75
    move v2, p2

    .line 76
    .local v2, "value":I
    if-nez p0, :cond_0

    move v3, v2

    .line 89
    .end local v2    # "value":I
    .local v3, "value":I
    :goto_0
    return v3

    .line 79
    .end local v3    # "value":I
    .restart local v2    # "value":I
    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/Properties;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 80
    .local v0, "propertyValue":Ljava/lang/Object;
    instance-of v4, v0, Ljava/lang/String;

    if-eqz v4, :cond_1

    .line 81
    invoke-virtual {p0, p1}, Ljava/util/Properties;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 82
    .local v1, "stringPropertyValue":Ljava/lang/String;
    if-eqz v0, :cond_1

    .line 84
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .end local v1    # "stringPropertyValue":Ljava/lang/String;
    :cond_1
    :goto_1
    move v3, v2

    .line 89
    .end local v2    # "value":I
    .restart local v3    # "value":I
    goto :goto_0

    .line 85
    .end local v3    # "value":I
    .restart local v1    # "stringPropertyValue":Ljava/lang/String;
    .restart local v2    # "value":I
    :catch_0
    move-exception v4

    goto :goto_1
.end method

.method public static toJSONValue(D)Ljava/lang/String;
    .locals 2
    .param p0, "val"    # D

    .prologue
    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0, p1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static toJSONValue(F)Ljava/lang/String;
    .locals 2
    .param p0, "val"    # F

    .prologue
    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static toJSONValue(I)Ljava/lang/String;
    .locals 2
    .param p0, "val"    # I

    .prologue
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static toJSONValue(J)Ljava/lang/String;
    .locals 2
    .param p0, "val"    # J

    .prologue
    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static toJSONValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "val"    # Ljava/lang/String;

    .prologue
    .line 23
    if-nez p0, :cond_0

    .line 24
    const-string v0, "null"

    .line 26
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static toJSONValue(Z)Ljava/lang/String;
    .locals 1
    .param p0, "val"    # Z

    .prologue
    .line 34
    invoke-static {p0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

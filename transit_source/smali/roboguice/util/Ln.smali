.class public Lroboguice/util/Ln;
.super Ljava/lang/Object;
.source "Ln.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lroboguice/util/Ln$Print;,
        Lroboguice/util/Ln$BaseConfig;,
        Lroboguice/util/Ln$Config;
    }
.end annotation


# static fields
.field protected static config:Lroboguice/util/Ln$BaseConfig;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field protected static print:Lroboguice/util/Ln$Print;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 60
    new-instance v0, Lroboguice/util/Ln$BaseConfig;

    invoke-direct {v0}, Lroboguice/util/Ln$BaseConfig;-><init>()V

    sput-object v0, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    .line 66
    new-instance v0, Lroboguice/util/Ln$Print;

    invoke-direct {v0}, Lroboguice/util/Ln$Print;-><init>()V

    sput-object v0, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs d(Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 4
    .param p0, "s1"    # Ljava/lang/Object;
    .param p1, "args"    # [Ljava/lang/Object;

    .prologue
    const/4 v3, 0x3

    .line 101
    sget-object v2, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v2, v2, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    if-le v2, v3, :cond_0

    .line 102
    const/4 v2, 0x0

    .line 106
    :goto_0
    return v2

    .line 104
    :cond_0
    invoke-static {p0}, Lroboguice/util/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 105
    .local v1, "s":Ljava/lang/String;
    array-length v2, p1

    if-lez v2, :cond_1

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 106
    .local v0, "message":Ljava/lang/String;
    :goto_1
    sget-object v2, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    invoke-virtual {v2, v3, v0}, Lroboguice/util/Ln$Print;->println(ILjava/lang/String;)I

    move-result v2

    goto :goto_0

    .end local v0    # "message":Ljava/lang/String;
    :cond_1
    move-object v0, v1

    .line 105
    goto :goto_1
.end method

.method public static d(Ljava/lang/Throwable;)I
    .locals 3
    .param p0, "t"    # Ljava/lang/Throwable;

    .prologue
    const/4 v2, 0x3

    .line 97
    sget-object v0, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v0, v0, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    if-gt v0, v2, :cond_0

    sget-object v0, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lroboguice/util/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static varargs d(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 5
    .param p0, "throwable"    # Ljava/lang/Throwable;
    .param p1, "s1"    # Ljava/lang/Object;
    .param p2, "args"    # [Ljava/lang/Object;

    .prologue
    const/4 v4, 0x3

    .line 110
    sget-object v2, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v2, v2, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    if-le v2, v4, :cond_0

    .line 111
    const/4 v2, 0x0

    .line 115
    :goto_0
    return v2

    .line 113
    :cond_0
    invoke-static {p1}, Lroboguice/util/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 114
    .local v1, "s":Ljava/lang/String;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    array-length v3, p2

    if-lez v3, :cond_1

    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .end local v1    # "s":Ljava/lang/String;
    :cond_1
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 115
    .local v0, "message":Ljava/lang/String;
    sget-object v2, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    invoke-virtual {v2, v4, v0}, Lroboguice/util/Ln$Print;->println(ILjava/lang/String;)I

    move-result v2

    goto :goto_0
.end method

.method public static varargs e(Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 4
    .param p0, "s1"    # Ljava/lang/Object;
    .param p1, "args"    # [Ljava/lang/Object;

    .prologue
    const/4 v3, 0x6

    .line 167
    sget-object v2, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v2, v2, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    if-le v2, v3, :cond_0

    .line 168
    const/4 v2, 0x0

    .line 172
    :goto_0
    return v2

    .line 170
    :cond_0
    invoke-static {p0}, Lroboguice/util/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 171
    .local v1, "s":Ljava/lang/String;
    array-length v2, p1

    if-lez v2, :cond_1

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 172
    .local v0, "message":Ljava/lang/String;
    :goto_1
    sget-object v2, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    invoke-virtual {v2, v3, v0}, Lroboguice/util/Ln$Print;->println(ILjava/lang/String;)I

    move-result v2

    goto :goto_0

    .end local v0    # "message":Ljava/lang/String;
    :cond_1
    move-object v0, v1

    .line 171
    goto :goto_1
.end method

.method public static e(Ljava/lang/Throwable;)I
    .locals 3
    .param p0, "t"    # Ljava/lang/Throwable;

    .prologue
    const/4 v2, 0x6

    .line 163
    sget-object v0, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v0, v0, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    if-gt v0, v2, :cond_0

    sget-object v0, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lroboguice/util/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static varargs e(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 5
    .param p0, "throwable"    # Ljava/lang/Throwable;
    .param p1, "s1"    # Ljava/lang/Object;
    .param p2, "args"    # [Ljava/lang/Object;

    .prologue
    const/4 v4, 0x6

    .line 176
    sget-object v2, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v2, v2, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    if-le v2, v4, :cond_0

    .line 177
    const/4 v2, 0x0

    .line 181
    :goto_0
    return v2

    .line 179
    :cond_0
    invoke-static {p1}, Lroboguice/util/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 180
    .local v1, "s":Ljava/lang/String;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    array-length v3, p2

    if-lez v3, :cond_1

    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .end local v1    # "s":Ljava/lang/String;
    :cond_1
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 181
    .local v0, "message":Ljava/lang/String;
    sget-object v2, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    invoke-virtual {v2, v4, v0}, Lroboguice/util/Ln$Print;->println(ILjava/lang/String;)I

    move-result v2

    goto :goto_0
.end method

.method public static getConfig()Lroboguice/util/Ln$Config;
    .locals 1

    .prologue
    .line 193
    sget-object v0, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    return-object v0
.end method

.method public static varargs i(Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 4
    .param p0, "s1"    # Ljava/lang/Object;
    .param p1, "args"    # [Ljava/lang/Object;

    .prologue
    const/4 v3, 0x4

    .line 123
    sget-object v2, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v2, v2, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    if-le v2, v3, :cond_0

    .line 124
    const/4 v2, 0x0

    .line 128
    :goto_0
    return v2

    .line 126
    :cond_0
    invoke-static {p0}, Lroboguice/util/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 127
    .local v1, "s":Ljava/lang/String;
    array-length v2, p1

    if-lez v2, :cond_1

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 128
    .local v0, "message":Ljava/lang/String;
    :goto_1
    sget-object v2, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    invoke-virtual {v2, v3, v0}, Lroboguice/util/Ln$Print;->println(ILjava/lang/String;)I

    move-result v2

    goto :goto_0

    .end local v0    # "message":Ljava/lang/String;
    :cond_1
    move-object v0, v1

    .line 127
    goto :goto_1
.end method

.method public static i(Ljava/lang/Throwable;)I
    .locals 3
    .param p0, "t"    # Ljava/lang/Throwable;

    .prologue
    const/4 v2, 0x4

    .line 119
    sget-object v0, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v0, v0, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    if-gt v0, v2, :cond_0

    sget-object v0, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lroboguice/util/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static varargs i(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 5
    .param p0, "throwable"    # Ljava/lang/Throwable;
    .param p1, "s1"    # Ljava/lang/Object;
    .param p2, "args"    # [Ljava/lang/Object;

    .prologue
    const/4 v4, 0x4

    .line 132
    sget-object v2, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v2, v2, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    if-le v2, v4, :cond_0

    .line 133
    const/4 v2, 0x0

    .line 137
    :goto_0
    return v2

    .line 135
    :cond_0
    invoke-static {p1}, Lroboguice/util/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 136
    .local v1, "s":Ljava/lang/String;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    array-length v3, p2

    if-lez v3, :cond_1

    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .end local v1    # "s":Ljava/lang/String;
    :cond_1
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 137
    .local v0, "message":Ljava/lang/String;
    sget-object v2, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    invoke-virtual {v2, v4, v0}, Lroboguice/util/Ln$Print;->println(ILjava/lang/String;)I

    move-result v2

    goto :goto_0
.end method

.method public static isDebugEnabled()Z
    .locals 2

    .prologue
    .line 185
    sget-object v0, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v0, v0, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isVerboseEnabled()Z
    .locals 2

    .prologue
    .line 189
    sget-object v0, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v0, v0, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static logLevelToString(I)Ljava/lang/String;
    .locals 1
    .param p0, "loglevel"    # I

    .prologue
    .line 235
    packed-switch p0, :pswitch_data_0

    .line 250
    const-string v0, "UNKNOWN"

    :goto_0
    return-object v0

    .line 237
    :pswitch_0
    const-string v0, "VERBOSE"

    goto :goto_0

    .line 239
    :pswitch_1
    const-string v0, "DEBUG"

    goto :goto_0

    .line 241
    :pswitch_2
    const-string v0, "INFO"

    goto :goto_0

    .line 243
    :pswitch_3
    const-string v0, "WARN"

    goto :goto_0

    .line 245
    :pswitch_4
    const-string v0, "ERROR"

    goto :goto_0

    .line 247
    :pswitch_5
    const-string v0, "ASSERT"

    goto :goto_0

    .line 235
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public static varargs v(Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 4
    .param p0, "s1"    # Ljava/lang/Object;
    .param p1, "args"    # [Ljava/lang/Object;

    .prologue
    const/4 v3, 0x2

    .line 79
    sget-object v2, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v2, v2, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    if-le v2, v3, :cond_0

    .line 80
    const/4 v2, 0x0

    .line 84
    :goto_0
    return v2

    .line 82
    :cond_0
    invoke-static {p0}, Lroboguice/util/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 83
    .local v1, "s":Ljava/lang/String;
    array-length v2, p1

    if-lez v2, :cond_1

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 84
    .local v0, "message":Ljava/lang/String;
    :goto_1
    sget-object v2, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    invoke-virtual {v2, v3, v0}, Lroboguice/util/Ln$Print;->println(ILjava/lang/String;)I

    move-result v2

    goto :goto_0

    .end local v0    # "message":Ljava/lang/String;
    :cond_1
    move-object v0, v1

    .line 83
    goto :goto_1
.end method

.method public static v(Ljava/lang/Throwable;)I
    .locals 3
    .param p0, "t"    # Ljava/lang/Throwable;

    .prologue
    const/4 v2, 0x2

    .line 75
    sget-object v0, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v0, v0, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    if-gt v0, v2, :cond_0

    sget-object v0, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lroboguice/util/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static varargs v(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 5
    .param p0, "throwable"    # Ljava/lang/Throwable;
    .param p1, "s1"    # Ljava/lang/Object;
    .param p2, "args"    # [Ljava/lang/Object;

    .prologue
    const/4 v4, 0x2

    .line 88
    sget-object v2, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v2, v2, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    if-le v2, v4, :cond_0

    .line 89
    const/4 v2, 0x0

    .line 93
    :goto_0
    return v2

    .line 91
    :cond_0
    invoke-static {p1}, Lroboguice/util/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 92
    .local v1, "s":Ljava/lang/String;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    array-length v3, p2

    if-lez v3, :cond_1

    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .end local v1    # "s":Ljava/lang/String;
    :cond_1
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 93
    .local v0, "message":Ljava/lang/String;
    sget-object v2, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    invoke-virtual {v2, v4, v0}, Lroboguice/util/Ln$Print;->println(ILjava/lang/String;)I

    move-result v2

    goto :goto_0
.end method

.method public static varargs w(Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 4
    .param p0, "s1"    # Ljava/lang/Object;
    .param p1, "args"    # [Ljava/lang/Object;

    .prologue
    const/4 v3, 0x5

    .line 145
    sget-object v2, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v2, v2, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    if-le v2, v3, :cond_0

    .line 146
    const/4 v2, 0x0

    .line 150
    :goto_0
    return v2

    .line 148
    :cond_0
    invoke-static {p0}, Lroboguice/util/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 149
    .local v1, "s":Ljava/lang/String;
    array-length v2, p1

    if-lez v2, :cond_1

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 150
    .local v0, "message":Ljava/lang/String;
    :goto_1
    sget-object v2, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    invoke-virtual {v2, v3, v0}, Lroboguice/util/Ln$Print;->println(ILjava/lang/String;)I

    move-result v2

    goto :goto_0

    .end local v0    # "message":Ljava/lang/String;
    :cond_1
    move-object v0, v1

    .line 149
    goto :goto_1
.end method

.method public static w(Ljava/lang/Throwable;)I
    .locals 3
    .param p0, "t"    # Ljava/lang/Throwable;

    .prologue
    const/4 v2, 0x5

    .line 141
    sget-object v0, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v0, v0, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    if-gt v0, v2, :cond_0

    sget-object v0, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lroboguice/util/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static varargs w(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 5
    .param p0, "throwable"    # Ljava/lang/Throwable;
    .param p1, "s1"    # Ljava/lang/Object;
    .param p2, "args"    # [Ljava/lang/Object;

    .prologue
    const/4 v4, 0x5

    .line 154
    sget-object v2, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v2, v2, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    if-le v2, v4, :cond_0

    .line 155
    const/4 v2, 0x0

    .line 159
    :goto_0
    return v2

    .line 157
    :cond_0
    invoke-static {p1}, Lroboguice/util/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 158
    .local v1, "s":Ljava/lang/String;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    array-length v3, p2

    if-lez v3, :cond_1

    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .end local v1    # "s":Ljava/lang/String;
    :cond_1
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 159
    .local v0, "message":Ljava/lang/String;
    sget-object v2, Lroboguice/util/Ln;->print:Lroboguice/util/Ln$Print;

    invoke-virtual {v2, v4, v0}, Lroboguice/util/Ln$Print;->println(ILjava/lang/String;)I

    move-result v2

    goto :goto_0
.end method

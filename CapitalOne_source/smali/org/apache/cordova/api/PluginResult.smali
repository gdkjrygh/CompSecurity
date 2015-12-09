.class public Lorg/apache/cordova/api/PluginResult;
.super Ljava/lang/Object;
.source "PluginResult.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/cordova/api/PluginResult$Status;
    }
.end annotation


# static fields
.field public static final MESSAGE_TYPE_BOOLEAN:I = 0x4

.field public static final MESSAGE_TYPE_JSON:I = 0x2

.field public static final MESSAGE_TYPE_NULL:I = 0x5

.field public static final MESSAGE_TYPE_NUMBER:I = 0x3

.field public static final MESSAGE_TYPE_STRING:I = 0x1

.field public static StatusMessages:[Ljava/lang/String;


# instance fields
.field private encodedMessage:Ljava/lang/String;

.field private keepCallback:Z

.field private final messageType:I

.field private final status:I

.field private strMessage:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 138
    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "No result"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "OK"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "Class not found"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "Illegal access"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "Instantiation error"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "Malformed url"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "IO error"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "Invalid action"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "JSON error"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "Error"

    aput-object v2, v0, v1

    sput-object v0, Lorg/apache/cordova/api/PluginResult;->StatusMessages:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/api/PluginResult$Status;)V
    .locals 2
    .param p1, "status"    # Lorg/apache/cordova/api/PluginResult$Status;

    .prologue
    .line 32
    sget-object v0, Lorg/apache/cordova/api/PluginResult;->StatusMessages:[Ljava/lang/String;

    invoke-virtual {p1}, Lorg/apache/cordova/api/PluginResult$Status;->ordinal()I

    move-result v1

    aget-object v0, v0, v1

    invoke-direct {p0, p1, v0}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .line 33
    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/api/PluginResult$Status;F)V
    .locals 2
    .param p1, "status"    # Lorg/apache/cordova/api/PluginResult$Status;
    .param p2, "f"    # F

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/cordova/api/PluginResult;->keepCallback:Z

    .line 60
    invoke-virtual {p1}, Lorg/apache/cordova/api/PluginResult$Status;->ordinal()I

    move-result v0

    iput v0, p0, Lorg/apache/cordova/api/PluginResult;->status:I

    .line 61
    const/4 v0, 0x3

    iput v0, p0, Lorg/apache/cordova/api/PluginResult;->messageType:I

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/cordova/api/PluginResult;->encodedMessage:Ljava/lang/String;

    .line 63
    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/api/PluginResult$Status;I)V
    .locals 2
    .param p1, "status"    # Lorg/apache/cordova/api/PluginResult$Status;
    .param p2, "i"    # I

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/cordova/api/PluginResult;->keepCallback:Z

    .line 54
    invoke-virtual {p1}, Lorg/apache/cordova/api/PluginResult$Status;->ordinal()I

    move-result v0

    iput v0, p0, Lorg/apache/cordova/api/PluginResult;->status:I

    .line 55
    const/4 v0, 0x3

    iput v0, p0, Lorg/apache/cordova/api/PluginResult;->messageType:I

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/cordova/api/PluginResult;->encodedMessage:Ljava/lang/String;

    .line 57
    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V
    .locals 1
    .param p1, "status"    # Lorg/apache/cordova/api/PluginResult$Status;
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/cordova/api/PluginResult;->keepCallback:Z

    .line 36
    invoke-virtual {p1}, Lorg/apache/cordova/api/PluginResult$Status;->ordinal()I

    move-result v0

    iput v0, p0, Lorg/apache/cordova/api/PluginResult;->status:I

    .line 37
    if-nez p2, :cond_0

    const/4 v0, 0x5

    :goto_0
    iput v0, p0, Lorg/apache/cordova/api/PluginResult;->messageType:I

    .line 38
    iput-object p2, p0, Lorg/apache/cordova/api/PluginResult;->strMessage:Ljava/lang/String;

    .line 39
    return-void

    .line 37
    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public constructor <init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONArray;)V
    .locals 1
    .param p1, "status"    # Lorg/apache/cordova/api/PluginResult$Status;
    .param p2, "message"    # Lorg/json/JSONArray;

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/cordova/api/PluginResult;->keepCallback:Z

    .line 42
    invoke-virtual {p1}, Lorg/apache/cordova/api/PluginResult$Status;->ordinal()I

    move-result v0

    iput v0, p0, Lorg/apache/cordova/api/PluginResult;->status:I

    .line 43
    const/4 v0, 0x2

    iput v0, p0, Lorg/apache/cordova/api/PluginResult;->messageType:I

    .line 44
    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/cordova/api/PluginResult;->encodedMessage:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V
    .locals 1
    .param p1, "status"    # Lorg/apache/cordova/api/PluginResult$Status;
    .param p2, "message"    # Lorg/json/JSONObject;

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/cordova/api/PluginResult;->keepCallback:Z

    .line 48
    invoke-virtual {p1}, Lorg/apache/cordova/api/PluginResult$Status;->ordinal()I

    move-result v0

    iput v0, p0, Lorg/apache/cordova/api/PluginResult;->status:I

    .line 49
    const/4 v0, 0x2

    iput v0, p0, Lorg/apache/cordova/api/PluginResult;->messageType:I

    .line 50
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/cordova/api/PluginResult;->encodedMessage:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/api/PluginResult$Status;Z)V
    .locals 1
    .param p1, "status"    # Lorg/apache/cordova/api/PluginResult$Status;
    .param p2, "b"    # Z

    .prologue
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/cordova/api/PluginResult;->keepCallback:Z

    .line 66
    invoke-virtual {p1}, Lorg/apache/cordova/api/PluginResult$Status;->ordinal()I

    move-result v0

    iput v0, p0, Lorg/apache/cordova/api/PluginResult;->status:I

    .line 67
    const/4 v0, 0x4

    iput v0, p0, Lorg/apache/cordova/api/PluginResult;->messageType:I

    .line 68
    invoke-static {p2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/cordova/api/PluginResult;->encodedMessage:Ljava/lang/String;

    .line 69
    return-void
.end method


# virtual methods
.method public getJSONString()Ljava/lang/String;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{\"status\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/apache/cordova/api/PluginResult;->status:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",\"message\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/apache/cordova/api/PluginResult;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",\"keepCallback\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lorg/apache/cordova/api/PluginResult;->keepCallback:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getKeepCallback()Z
    .locals 1

    .prologue
    .line 99
    iget-boolean v0, p0, Lorg/apache/cordova/api/PluginResult;->keepCallback:Z

    return v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lorg/apache/cordova/api/PluginResult;->encodedMessage:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 85
    iget-object v0, p0, Lorg/apache/cordova/api/PluginResult;->strMessage:Ljava/lang/String;

    invoke-static {v0}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/cordova/api/PluginResult;->encodedMessage:Ljava/lang/String;

    .line 87
    :cond_0
    iget-object v0, p0, Lorg/apache/cordova/api/PluginResult;->encodedMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getMessageType()I
    .locals 1

    .prologue
    .line 80
    iget v0, p0, Lorg/apache/cordova/api/PluginResult;->messageType:I

    return v0
.end method

.method public getStatus()I
    .locals 1

    .prologue
    .line 76
    iget v0, p0, Lorg/apache/cordova/api/PluginResult;->status:I

    return v0
.end method

.method public getStrMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lorg/apache/cordova/api/PluginResult;->strMessage:Ljava/lang/String;

    return-object v0
.end method

.method public setKeepCallback(Z)V
    .locals 0
    .param p1, "b"    # Z

    .prologue
    .line 72
    iput-boolean p1, p0, Lorg/apache/cordova/api/PluginResult;->keepCallback:Z

    .line 73
    return-void
.end method

.method public toCallbackString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "callbackId"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 110
    iget v0, p0, Lorg/apache/cordova/api/PluginResult;->status:I

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v1}, Lorg/apache/cordova/api/PluginResult$Status;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lorg/apache/cordova/api/PluginResult;->keepCallback:Z

    if-eqz v0, :cond_0

    .line 111
    const/4 v0, 0x0

    .line 119
    :goto_0
    return-object v0

    .line 115
    :cond_0
    iget v0, p0, Lorg/apache/cordova/api/PluginResult;->status:I

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v1}, Lorg/apache/cordova/api/PluginResult$Status;->ordinal()I

    move-result v1

    if-eq v0, v1, :cond_1

    iget v0, p0, Lorg/apache/cordova/api/PluginResult;->status:I

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v1}, Lorg/apache/cordova/api/PluginResult$Status;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 116
    :cond_1
    invoke-virtual {p0, p1}, Lorg/apache/cordova/api/PluginResult;->toSuccessCallbackString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 119
    :cond_2
    invoke-virtual {p0, p1}, Lorg/apache/cordova/api/PluginResult;->toErrorCallbackString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public toErrorCallbackString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "callbackId"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cordova.callbackError(\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\', "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/apache/cordova/api/PluginResult;->getJSONString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ");"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toSuccessCallbackString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "callbackId"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cordova.callbackSuccess(\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\',"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/apache/cordova/api/PluginResult;->getJSONString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ");"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final enum Lcom/facebook/common/w/q;
.super Ljava/lang/Enum;
.source "TriState.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/common/w/q;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/common/w/q;

.field public static final enum NO:Lcom/facebook/common/w/q;

.field public static final enum UNSET:Lcom/facebook/common/w/q;

.field public static final enum YES:Lcom/facebook/common/w/q;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 9
    new-instance v0, Lcom/facebook/common/w/q;

    const-string v1, "YES"

    invoke-direct {v0, v1, v2}, Lcom/facebook/common/w/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    .line 10
    new-instance v0, Lcom/facebook/common/w/q;

    const-string v1, "NO"

    invoke-direct {v0, v1, v3}, Lcom/facebook/common/w/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    .line 11
    new-instance v0, Lcom/facebook/common/w/q;

    const-string v1, "UNSET"

    invoke-direct {v0, v1, v4}, Lcom/facebook/common/w/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    .line 8
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/common/w/q;

    sget-object v1, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/common/w/q;->$VALUES:[Lcom/facebook/common/w/q;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 55
    return-void
.end method

.method public static valueOf(Ljava/lang/Boolean;)Lcom/facebook/common/w/q;
    .locals 1

    .prologue
    .line 36
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Lcom/facebook/common/w/q;->valueOf(Z)Lcom/facebook/common/w/q;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/common/w/q;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/facebook/common/w/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/w/q;

    return-object v0
.end method

.method public static valueOf(Z)Lcom/facebook/common/w/q;
    .locals 1

    .prologue
    .line 32
    if-eqz p0, :cond_0

    sget-object v0, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    goto :goto_0
.end method

.method public static values()[Lcom/facebook/common/w/q;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/facebook/common/w/q;->$VALUES:[Lcom/facebook/common/w/q;

    invoke-virtual {v0}, [Lcom/facebook/common/w/q;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/common/w/q;

    return-object v0
.end method


# virtual methods
.method public asBoolean()Z
    .locals 3

    .prologue
    .line 47
    sget-object v0, Lcom/facebook/common/w/r;->a:[I

    invoke-virtual {p0}, Lcom/facebook/common/w/q;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 55
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognzied TriState value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :pswitch_0
    const/4 v0, 0x1

    .line 51
    :goto_0
    return v0

    :pswitch_1
    const/4 v0, 0x0

    goto :goto_0

    .line 53
    :pswitch_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No boolean equivalent for UNSET"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 47
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public asBoolean(Z)Z
    .locals 3

    .prologue
    .line 68
    sget-object v0, Lcom/facebook/common/w/r;->a:[I

    invoke-virtual {p0}, Lcom/facebook/common/w/q;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 76
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognzied TriState value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :pswitch_0
    const/4 p1, 0x1

    .line 74
    :goto_0
    :pswitch_1
    return p1

    .line 72
    :pswitch_2
    const/4 p1, 0x0

    goto :goto_0

    .line 68
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public asBooleanObject()Ljava/lang/Boolean;
    .locals 3

    .prologue
    .line 88
    sget-object v0, Lcom/facebook/common/w/r;->a:[I

    invoke-virtual {p0}, Lcom/facebook/common/w/q;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 96
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognzied TriState value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 90
    :pswitch_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 94
    :goto_0
    return-object v0

    .line 92
    :pswitch_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    .line 94
    :pswitch_2
    const/4 v0, 0x0

    goto :goto_0

    .line 88
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public isSet()Z
    .locals 1

    .prologue
    .line 16
    sget-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

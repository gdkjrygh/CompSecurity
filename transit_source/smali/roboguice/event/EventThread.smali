.class public final enum Lroboguice/event/EventThread;
.super Ljava/lang/Enum;
.source "EventThread.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lroboguice/event/EventThread;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lroboguice/event/EventThread;

.field public static final enum BACKGROUND:Lroboguice/event/EventThread;

.field public static final enum CURRENT:Lroboguice/event/EventThread;

.field public static final enum UI:Lroboguice/event/EventThread;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 20
    new-instance v0, Lroboguice/event/EventThread;

    const-string v1, "CURRENT"

    invoke-direct {v0, v1, v2}, Lroboguice/event/EventThread;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lroboguice/event/EventThread;->CURRENT:Lroboguice/event/EventThread;

    .line 21
    new-instance v0, Lroboguice/event/EventThread;

    const-string v1, "UI"

    invoke-direct {v0, v1, v3}, Lroboguice/event/EventThread;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lroboguice/event/EventThread;->UI:Lroboguice/event/EventThread;

    .line 22
    new-instance v0, Lroboguice/event/EventThread;

    const-string v1, "BACKGROUND"

    invoke-direct {v0, v1, v4}, Lroboguice/event/EventThread;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lroboguice/event/EventThread;->BACKGROUND:Lroboguice/event/EventThread;

    .line 19
    const/4 v0, 0x3

    new-array v0, v0, [Lroboguice/event/EventThread;

    sget-object v1, Lroboguice/event/EventThread;->CURRENT:Lroboguice/event/EventThread;

    aput-object v1, v0, v2

    sget-object v1, Lroboguice/event/EventThread;->UI:Lroboguice/event/EventThread;

    aput-object v1, v0, v3

    sget-object v1, Lroboguice/event/EventThread;->BACKGROUND:Lroboguice/event/EventThread;

    aput-object v1, v0, v4

    sput-object v0, Lroboguice/event/EventThread;->$VALUES:[Lroboguice/event/EventThread;

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
    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lroboguice/event/EventThread;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 19
    const-class v0, Lroboguice/event/EventThread;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lroboguice/event/EventThread;

    return-object v0
.end method

.method public static values()[Lroboguice/event/EventThread;
    .locals 1

    .prologue
    .line 19
    sget-object v0, Lroboguice/event/EventThread;->$VALUES:[Lroboguice/event/EventThread;

    invoke-virtual {v0}, [Lroboguice/event/EventThread;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lroboguice/event/EventThread;

    return-object v0
.end method

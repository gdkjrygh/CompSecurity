.class public final enum Ljavax/annotation/Resource$AuthenticationType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljavax/annotation/Resource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AuthenticationType"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ljavax/annotation/Resource$AuthenticationType;

.field public static final enum APPLICATION:Ljavax/annotation/Resource$AuthenticationType;

.field public static final enum CONTAINER:Ljavax/annotation/Resource$AuthenticationType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 80
    new-instance v0, Ljavax/annotation/Resource$AuthenticationType;

    const-string v1, "CONTAINER"

    invoke-direct {v0, v1, v2}, Ljavax/annotation/Resource$AuthenticationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljavax/annotation/Resource$AuthenticationType;->CONTAINER:Ljavax/annotation/Resource$AuthenticationType;

    .line 81
    new-instance v0, Ljavax/annotation/Resource$AuthenticationType;

    const-string v1, "APPLICATION"

    invoke-direct {v0, v1, v3}, Ljavax/annotation/Resource$AuthenticationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljavax/annotation/Resource$AuthenticationType;->APPLICATION:Ljavax/annotation/Resource$AuthenticationType;

    .line 79
    const/4 v0, 0x2

    new-array v0, v0, [Ljavax/annotation/Resource$AuthenticationType;

    sget-object v1, Ljavax/annotation/Resource$AuthenticationType;->CONTAINER:Ljavax/annotation/Resource$AuthenticationType;

    aput-object v1, v0, v2

    sget-object v1, Ljavax/annotation/Resource$AuthenticationType;->APPLICATION:Ljavax/annotation/Resource$AuthenticationType;

    aput-object v1, v0, v3

    sput-object v0, Ljavax/annotation/Resource$AuthenticationType;->$VALUES:[Ljavax/annotation/Resource$AuthenticationType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 79
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ljavax/annotation/Resource$AuthenticationType;
    .locals 1

    .prologue
    .line 79
    const-class v0, Ljavax/annotation/Resource$AuthenticationType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Ljavax/annotation/Resource$AuthenticationType;

    return-object v0
.end method

.method public static final values()[Ljavax/annotation/Resource$AuthenticationType;
    .locals 1

    .prologue
    .line 79
    sget-object v0, Ljavax/annotation/Resource$AuthenticationType;->$VALUES:[Ljavax/annotation/Resource$AuthenticationType;

    invoke-virtual {v0}, [Ljavax/annotation/Resource$AuthenticationType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljavax/annotation/Resource$AuthenticationType;

    return-object v0
.end method

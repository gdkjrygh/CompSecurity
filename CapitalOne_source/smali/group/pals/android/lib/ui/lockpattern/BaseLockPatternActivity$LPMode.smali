.class public enum Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;
.super Ljava/lang/Enum;
.source "BaseLockPatternActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = "LPMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

.field public static final enum ComparePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

.field public static final enum CreatePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 92
    new-instance v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode$1;

    const-string v1, "CreatePattern"

    invoke-direct {v0, v1, v2}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->CreatePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    .line 101
    new-instance v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode$2;

    const-string v1, "ComparePattern"

    invoke-direct {v0, v1, v3}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->ComparePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    .line 88
    const/4 v0, 0x2

    new-array v0, v0, [Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->CreatePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    aput-object v1, v0, v2

    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->ComparePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    aput-object v1, v0, v3

    sput-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->$VALUES:[Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

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
    .line 88
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # I
    .param p3, "x2"    # Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$1;

    .prologue
    .line 88
    invoke-direct {p0, p1, p2}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 88
    const-class v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    return-object v0
.end method

.method public static values()[Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;
    .locals 1

    .prologue
    .line 88
    sget-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->$VALUES:[Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    invoke-virtual {v0}, [Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    return-object v0
.end method

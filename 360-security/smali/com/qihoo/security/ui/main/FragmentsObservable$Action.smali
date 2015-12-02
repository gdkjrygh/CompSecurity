.class public final enum Lcom/qihoo/security/ui/main/FragmentsObservable$Action;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/main/FragmentsObservable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Action"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/ui/main/FragmentsObservable$Action;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ActionBar:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

.field public static final enum Antivirus_Scan:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

.field public static final enum Boost:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

.field public static final enum Clean_Scan:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

.field public static final enum DrawerClose:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

.field public static final enum DrawerOpen:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

.field public static final enum HideRecmdAin:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

.field public static final enum HideRecmdBoost:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

.field public static final enum HideRecmdClean:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

.field public static final enum HideRecmdOther:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

.field public static final enum MoreMenuClose:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

.field public static final enum MoreMenuShow:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

.field private static final synthetic a:[Lcom/qihoo/security/ui/main/FragmentsObservable$Action;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 39
    new-instance v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    const-string/jumbo v1, "Clean_Scan"

    invoke-direct {v0, v1, v3}, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->Clean_Scan:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    .line 43
    new-instance v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    const-string/jumbo v1, "Antivirus_Scan"

    invoke-direct {v0, v1, v4}, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->Antivirus_Scan:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    .line 48
    new-instance v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    const-string/jumbo v1, "Boost"

    invoke-direct {v0, v1, v5}, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->Boost:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    .line 53
    new-instance v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    const-string/jumbo v1, "ActionBar"

    invoke-direct {v0, v1, v6}, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->ActionBar:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    .line 58
    new-instance v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    const-string/jumbo v1, "DrawerOpen"

    invoke-direct {v0, v1, v7}, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->DrawerOpen:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    .line 62
    new-instance v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    const-string/jumbo v1, "DrawerClose"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->DrawerClose:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    .line 67
    new-instance v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    const-string/jumbo v1, "MoreMenuShow"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->MoreMenuShow:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    .line 72
    new-instance v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    const-string/jumbo v1, "MoreMenuClose"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->MoreMenuClose:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    .line 77
    new-instance v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    const-string/jumbo v1, "HideRecmdClean"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->HideRecmdClean:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    new-instance v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    const-string/jumbo v1, "HideRecmdOther"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->HideRecmdOther:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    new-instance v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    const-string/jumbo v1, "HideRecmdBoost"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->HideRecmdBoost:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    new-instance v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    const-string/jumbo v1, "HideRecmdAin"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->HideRecmdAin:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    .line 35
    const/16 v0, 0xc

    new-array v0, v0, [Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    sget-object v1, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->Clean_Scan:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->Antivirus_Scan:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->Boost:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    aput-object v1, v0, v5

    sget-object v1, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->ActionBar:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    aput-object v1, v0, v6

    sget-object v1, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->DrawerOpen:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->DrawerClose:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->MoreMenuShow:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->MoreMenuClose:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->HideRecmdClean:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->HideRecmdOther:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->HideRecmdBoost:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->HideRecmdAin:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->a:[Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

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
    .line 35
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/ui/main/FragmentsObservable$Action;
    .locals 1

    .prologue
    .line 35
    const-class v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/ui/main/FragmentsObservable$Action;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->a:[Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    invoke-virtual {v0}, [Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    return-object v0
.end method

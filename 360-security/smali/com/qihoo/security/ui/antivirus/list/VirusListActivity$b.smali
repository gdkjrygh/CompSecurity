.class final enum Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

.field public static final enum b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

.field public static final enum c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

.field public static final enum d:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

.field private static final synthetic e:[Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 125
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    const-string/jumbo v1, "REPAIR_ALL"

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    .line 126
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    const-string/jumbo v1, "REPAIR_SELECTED"

    invoke-direct {v0, v1, v3}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    .line 127
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    const-string/jumbo v1, "REPAIR"

    invoke-direct {v0, v1, v4}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    .line 128
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    const-string/jumbo v1, "FINISH"

    invoke-direct {v0, v1, v5}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->d:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    .line 124
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->d:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    aput-object v1, v0, v5

    sput-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->e:[Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

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
    .line 124
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;
    .locals 1

    .prologue
    .line 124
    const-class v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;
    .locals 1

    .prologue
    .line 124
    sget-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->e:[Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    invoke-virtual {v0}, [Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    return-object v0
.end method

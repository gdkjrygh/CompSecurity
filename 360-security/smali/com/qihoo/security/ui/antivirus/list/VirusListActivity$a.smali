.class final enum Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

.field public static final enum b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

.field public static final enum c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

.field public static final enum d:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

.field private static final synthetic e:[Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 134
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    const-string/jumbo v1, "NORMAL"

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    .line 135
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    const-string/jumbo v1, "RISKYAPP"

    invoke-direct {v0, v1, v3}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    .line 136
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    const-string/jumbo v1, "ADVAPP"

    invoke-direct {v0, v1, v4}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    .line 137
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    const-string/jumbo v1, "MALWARE"

    invoke-direct {v0, v1, v5}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->d:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    .line 133
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->d:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    aput-object v1, v0, v5

    sput-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->e:[Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

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
    .line 133
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;
    .locals 1

    .prologue
    .line 133
    const-class v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;
    .locals 1

    .prologue
    .line 133
    sget-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->e:[Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    invoke-virtual {v0}, [Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    return-object v0
.end method

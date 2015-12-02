.class Lcom/qihoo/security/adv/AdvDataManager$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/android/volley/k$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;ILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/volley/k$b",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

.field final synthetic b:I

.field final synthetic c:Lcom/qihoo/security/adv/AdvDataManager;


# direct methods
.method constructor <init>(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;I)V
    .locals 0

    .prologue
    .line 1273
    iput-object p1, p0, Lcom/qihoo/security/adv/AdvDataManager$2;->c:Lcom/qihoo/security/adv/AdvDataManager;

    iput-object p2, p0, Lcom/qihoo/security/adv/AdvDataManager$2;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    iput p3, p0, Lcom/qihoo/security/adv/AdvDataManager$2;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1273
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/adv/AdvDataManager$2;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1281
    return-void
.end method

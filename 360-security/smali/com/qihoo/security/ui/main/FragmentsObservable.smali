.class public Lcom/qihoo/security/ui/main/FragmentsObservable;
.super Ljava/util/Observable;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/main/FragmentsObservable$Action;,
        Lcom/qihoo/security/ui/main/FragmentsObservable$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/util/Observable;-><init>()V

    .line 35
    return-void
.end method

.method public static a(Lcom/qihoo/security/ui/main/FragmentsObservable;)V
    .locals 1

    .prologue
    .line 101
    sget-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->ActionBar:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    invoke-static {p0, v0}, Lcom/qihoo/security/ui/main/FragmentsObservable;->a(Lcom/qihoo/security/ui/main/FragmentsObservable;Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    .line 102
    return-void
.end method

.method public static a(Lcom/qihoo/security/ui/main/FragmentsObservable;Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V
    .locals 0

    .prologue
    .line 105
    if-eqz p0, :cond_0

    .line 106
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/main/FragmentsObservable;->a(Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    .line 108
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V
    .locals 0

    .prologue
    .line 96
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/FragmentsObservable;->setChanged()V

    .line 97
    invoke-super {p0, p1}, Ljava/util/Observable;->notifyObservers(Ljava/lang/Object;)V

    .line 98
    return-void
.end method

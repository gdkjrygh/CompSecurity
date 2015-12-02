.class Lcom/facebook/orca/login/n;
.super Ljava/lang/Object;
.source "WildfireRegPhoneNumberViewGroup.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/facebook/orca/login/n;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/lang/String;

.field final c:Ljava/lang/String;

.field final synthetic d:Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/facebook/orca/login/n;->d:Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p2, p0, Lcom/facebook/orca/login/n;->a:Ljava/lang/String;

    .line 50
    iput-object p3, p0, Lcom/facebook/orca/login/n;->b:Ljava/lang/String;

    .line 51
    iput-object p4, p0, Lcom/facebook/orca/login/n;->c:Ljava/lang/String;

    .line 52
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/login/n;)I
    .locals 2

    .prologue
    .line 61
    invoke-virtual {p0}, Lcom/facebook/orca/login/n;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/login/n;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 43
    check-cast p1, Lcom/facebook/orca/login/n;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/login/n;->a(Lcom/facebook/orca/login/n;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/facebook/orca/login/n;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/login/n;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class Lcom/facebook/orca/phonenumber/identification/g;
.super Ljava/lang/Object;
.source "VerifyPhoneNumberSmsConsumer.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/phonenumber/identification/f;


# direct methods
.method constructor <init>(Lcom/facebook/orca/phonenumber/identification/f;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lcom/facebook/orca/phonenumber/identification/g;->a:Lcom/facebook/orca/phonenumber/identification/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/g;->a:Lcom/facebook/orca/phonenumber/identification/f;

    invoke-static {v0}, Lcom/facebook/orca/phonenumber/identification/f;->a(Lcom/facebook/orca/phonenumber/identification/f;)V

    .line 127
    return-void
.end method

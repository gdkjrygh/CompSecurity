.class public Lcom/facebook/contacts/database/AddressBookPeriodicRunner$LocalBroadcastReceiver;
.super Lcom/facebook/c/k;
.source "AddressBookPeriodicRunner.java"


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 268
    const-string v0, "com.facebook.orca.database.ACTION_ALARM"

    new-instance v1, Lcom/facebook/contacts/database/e;

    invoke-direct {v1}, Lcom/facebook/contacts/database/e;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/facebook/c/k;-><init>(Ljava/lang/String;Lcom/facebook/c/b;)V

    .line 269
    return-void
.end method

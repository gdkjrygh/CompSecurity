.class public Lcom/facebook/orca/contacts/picker/j;
.super Ljava/lang/Object;
.source "ContactPickerAddPhoneOrEmailRow.java"

# interfaces
.implements Lcom/facebook/contacts/picker/ad;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/user/s;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/facebook/user/s;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/j;->a:Ljava/lang/String;

    .line 22
    iput-object p2, p0, Lcom/facebook/orca/contacts/picker/j;->b:Lcom/facebook/user/s;

    .line 23
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/j;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/facebook/user/s;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/j;->b:Lcom/facebook/user/s;

    return-object v0
.end method

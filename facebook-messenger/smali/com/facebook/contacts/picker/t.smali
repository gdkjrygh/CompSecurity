.class public Lcom/facebook/contacts/picker/t;
.super Ljava/lang/Object;
.source "ContactPickerInviteContactRow.java"

# interfaces
.implements Lcom/facebook/contacts/picker/ad;


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/facebook/contacts/picker/t;->a:Ljava/lang/String;

    .line 14
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/facebook/contacts/picker/t;->a:Ljava/lang/String;

    return-object v0
.end method
